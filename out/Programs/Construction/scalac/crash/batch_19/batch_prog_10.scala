package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: Int, b: T_B[B], c: (CC_A,Byte)) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(12, _, (_,_)), _) => 0 
  case CC_B(_, CC_B(_, _, (_,_)), _) => 1 
}
}