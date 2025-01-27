package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[Int, Int]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: C, b: CC_A, c: ((T_A,Int),T_A)) extends T_A
case class CC_D(a: Byte, b: T_A, c: Int) extends T_B[CC_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _, _)) => 3 
  case CC_C(_, CC_A(_, _), (_,_)) => 4 
}
}