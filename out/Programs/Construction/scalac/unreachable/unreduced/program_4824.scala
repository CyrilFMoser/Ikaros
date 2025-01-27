package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: (T_B[CC_B],T_B[(Int,Byte)])) extends T_A
case class CC_D(a: Byte) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_A((_,_), CC_A(_, _)), _) => 1 
  case CC_C(CC_A((_,_), CC_B()), _) => 2 
  case CC_C(CC_A((_,_), CC_C(_, _)), _) => 3 
  case CC_C(CC_B(), _) => 4 
  case CC_C(CC_C(_, (_,_)), _) => 5 
}
}
// This is not matched: CC_B()