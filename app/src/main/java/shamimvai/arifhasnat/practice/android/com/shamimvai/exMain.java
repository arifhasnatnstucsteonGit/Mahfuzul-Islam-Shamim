package shamimvai.arifhasnat.practice.android.com.shamimvai;

import android.app.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class exMain extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new shamimvai.arifhasnat.practice.android.com.shamimvai.ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // first phase -----------------------------

        // Adding child data
        listDataHeader.add("Child Hood");
        listDataHeader.add("Permanent Address");
        listDataHeader.add("Education");
        listDataHeader.add("Job Experience");
        listDataHeader.add("Activities");

        //--------------second phase---------------------

        // Adding child data
        List<String> Born = new ArrayList<String>();
        Born.add("At Rangpur City");


        List<String> Address = new ArrayList<String>();
        Address.add("Rangpur ,Bangladesh");

        List<String> Education = new ArrayList<String>();
        Education.add("University of Dhaka\n" +
                "Bachelor of Arts (B.A.), Honors, Bengali Language and Literature, 2nd Class 1st Position\n" +
                "1998 – 2002\n" +
                "Leadership\n" +
                "Activities and Societies: Acting Drama, Social & Cultural movement, Debating\n" +
                "(Open)1 honor or award\n" +
                "Dhaka College, Dhaka\n" +
                "HSC, Science\n" +
                "1995 – 1997\n" +
                "Writers Club\n" +
                "Activities and Societies: Debating\n" +
                "Rajarhat Pilot High School, Kurigram\n" +
                "SSC, Science\n" +
                "1990 – 1995\n" +
                "Organized Cultural Activities");


        List<String> job = new ArrayList<String>();
        job.add("Current\tIT/ITES Specialist at Leveraging ICT Project at The World Bank, IT/ITES Specialist at Leveraging ICT for Growth, Employment and Governance\n" +
                "Past\tConsultant at Leveraging ICT project, World Bank at The World Bank, Assistant Secretary at Ministry of Public Administration, Policy...");
        List<String> activities = new ArrayList<String>();
        activities.add("IT/ITES Specialist at Leveraging ICT Project\n" +
                "The World Bank\n" +
                "December 2014 – Present (1 year)BCC, Dhaka\n" +
                "•\tProvide significant substantive inputs on IT/ITES Strategy plans; including advice to the project implementation team and relevant consulting firms on their area of specialization\n" +
                "•\tRepresent the unit on industry forums and conferences in his/her area of specialization\n" +
                "•\tGather technical inputs from local IT/ITES companies and provide feedback into the unit’s planning processes\n" +
                "•\tAssist in coordination of the activities with BCC (especially with the Project Coordination Unit’s relevant Technical Specialist), IT/ITES industry associations and companies, relevant consulting firms hired under the project, local stakeholders and any other relevant parties\n" +
                "•\tAssist in development of the IT/ITES Strategy documents with relevant consulting firms\n" +
                "•\tBuild multi-stakeholder involvement and ownership of the IT/ITES industry development activities\n" +
                "•\tGather IT/ITES industry inputs on IT/ITES Strategy on a regular basis, and ensuring its incorporation into the unit’s planning processes\n" +
                "•\tSupport the entire business development processes by providing technical inputs, coordinating meetings, drafting necessary documents, etc.\n" +
                "•\tWork with the relevant consulting firm to coordinate and facilitate meetings between the IT/ITES champions, expert advisor and potential IT/ITES clients\n" +
                "•\tStocktake the capacity and competencies of local IT/ITES companies, and maintain a database for use in business development\n" +
                "•\tAssist in linking local IT/ITES companies with potential clients; and coordinate and facilitate meetings and discussions between the parties\n" +
                "IT/ITES Specialist\n" +
                "Leveraging ICT for Growth, Employment and Governance\n" +
                "August 2013 – Present (2 years 4 months)\n" +
                "•\tProvide significant substantive inputs on IT/ITES Strategy plans; including advice to the project implementation team and relevant consulting firms on their area of specialization\n" +
                "•\tRepresent the unit on industry forums and conferences in his/her area of specialization\n" +
                "•\tGather technical inputs from local IT/ITES companies and provide feedback into the unit’s planning processes\n" +
                "•\tAssist in coordination of the activities with BCC (especially with the Project Coordination Unit’s relevant Technical Specialist), IT/ITES industry associations and companies, relevant consulting firms hired under the project, local stakeholders and any other relevant parties\n" +
                "•\tAssist in development of the IT/ITES Strategy documents with relevant consulting firms\n" +
                "•\tBuild multi-stakeholder involvement and ownership of the IT/ITES industry development activities\n" +
                "•\tGather IT/ITES industry inputs on IT/ITES Strategy on a regular basis, and ensuring its incorporation into the unit’s planning processes\n" +
                "•\tSupport the entire business development processes by providing technical inputs, coordinating meetings, drafting necessary documents, etc.\n" +
                "•\tWork with the relevant consulting firm to coordinate and facilitate meetings between the IT/ITES champions, expert advisor and potential IT/ITES clients\n" +
                "•\tStocktake the capacity and competencies of local IT/ITES companies, and maintain a database for use in business development\n" +
                "•\tAssist in linking local IT/ITES companies with potential clients; and coordinate and facilitate meetings and discussions between the parties\n" +
                "Consultant at Leveraging ICT project, World Bank\n" +
                "The World Bank\n" +
                "August 2013 – December 2014 (1 year 5 months)BCC, Dhaka\n" +
                "Key Responsibilities as Consultant\n" +
                "\n" +
                "\n" +
                "•\tAssistance to facilitate and monitor project activities; working in support of and with BCC, private sector and other relevant stakeholders\n" +
                "•\tAssistance in drafting work plans, TORs and progress reports, supervise work of contractors/consultants for project activities\n" +
                "•\tMonitor overall progress on achievement of results, based on the indicators.\n" +
                "•\tProvide project management, coordination and implementation reports\n" +
                "•\tAssist the Technical Specialists in communicating and exchanging information with partners and stakeholders in the project areas\n" +
                "•\tParticipate in visit to the project site(s) as required, and assistance to collect information to prepare reports\n" +
                "•\tAssistance in compiling statistics and information from monitoring visits\n" +
                "•\tDraft inputs, information and statistics for quarterly, annual and other reports to the BCC and World Bank. \n" +
                "•\tProvide services, within respective field of responsibility and competence, on ad-hoc basis if needed and requested by the project implementation unit\n" +
                "Assistant Secretary\n" +
                "Ministry of Public Administration\n" +
                "July 2013 – July 2013 (1 month)Bangladesh Secretariat\n" +
                "As an Assistant Secretary I had to do the special administrative duties assigned by my superiors.\n" +
                "Policy Associate\n" +
                "UNDP\n" +
                "January 2013 – July 2013 (7 months)Dhaka, Bangladesh\n" +
                "#Liaise with Govt. Officers and other stakeholders leading support to digital Bangladesh and laws for the ICT4D.\n" +
                "# Build partnerships with Government institutions, especially the Ministry of Public Administration, the cabinet division, and the concerned Deputy Commissioner’s Office; donors and UN agencies, \n" +
                "•\tAssist to design research consultation \n" +
                "•\tArrange consultations with relevant stakeholders and prepare minutes \n" +
                "•\tSupport to prepare research report \n" +
                "•\tDevelop rapid drafts of policy briefs and make policy presentation as and when needed \n" +
                "•\tAssist to explore relevant best e-service delivery practices at local and international level \n" +
                "•\tSupport to prepare report on e-service delivery best models \n" +
                "•\tArrange consultations with relevant policy makers and prepare minutes \n" +
                "•\tSupport to prepare draft policy papers \n" +
                "•\tAssist to identify key laws and regulations that are necessary in order to develop fully enabled e-services \n" +
                "•\tArrange consultations with relevant stakeholders and prepare minutes \n" +
                "•\tSupport to prepare strategy report for ICT4D initiatives \n" +
                "•\tFunction as an effective team member of Enabling Environment component of the project. \n" +
                "•\tPerform other related duties and responsibilities as and when required assigned by project management\n" +
                "Assistant Commissioner &Executive Magistrate\n" +
                "Govt. of Bangladesh\n" +
                "August 2011 – January 2013 (1 year 6 months)\n" +
                "Key Responsibilities as AC (ICT)\n" +
                "•\tMake training manuals for ICT entrepreneurs of the Union Information and Service Centre (UISC)\n" +
                "•\tMake evaluations and prepare reports about the activities of UISCs\n" +
                "•\tPreparation of website of district administration as well as directions for preparing websites of sub-district administration\n" +
                "•\tExecuting different trainings, digital-fair, seminars and workshops on ICT\n" +
                "•\tWriting policy papers for ICT development in district level\n" +
                "Key Responsibilities as DDLG\n" +
                "•\tPrepare instrumental policies at field level to make the development projects successful and accountable\n" +
                "•\tTo monitor and evaluate the subordinate administrative units\n" +
                "•\tPrepare code of conducts and standards for the execution of government manifestoes\n" +
                "•\tConduct seminars and workshops to strengthen the local governments, and\n" +
                "\n" +
                "Key Responsibilities as NDC\n" +
                "\n" +
                "•\tHuman resource management for the Deputy Commissioner\n" +
                "•\tCollection of meeting minutes and preparation final draft of Resolution \n" +
                "•\tPolicy and protocol management\n" +
                "•\tPreparation of instruments for better human resource polices\n" +
                "•\tManagement and monitor other government and local resources\n" +
                "Lecturer\n" +
                "Govt. College\n" +
                "April 2006 – July 2011 (5 years 4 months)\n" +
                "Key Responsibilities:\n" +
                "•\tWorking as member of policy making committee for primary and secondary level education\n" +
                "•\tPrepare in-house policy for result-oriented education system at college level\n" +
                "•\tPolicy making for more transparent and effective exam system\n" +
                "•\tPublications for newspapers and government outlets about government education policies");

        //-------------------------------third phase-------------------

        listDataChild.put(listDataHeader.get(0), Born); // Header, Child data

        listDataChild.put(listDataHeader.get(1), Address);
        listDataChild.put(listDataHeader.get(2), Education);
        listDataChild.put(listDataHeader.get(3), job);
        listDataChild.put(listDataHeader.get(4), activities);
    }
}