package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_A[Boolean], c: Int) extends T_A[Boolean]
case class CC_C(a: T_A[(CC_A,CC_A)], b: CC_B, c: (CC_B,CC_B)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
  case CC_B(CC_B(CC_A(_, _), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 4 
  case CC_B(CC_C(_, CC_B(_, _, _), (_,_)), _, _) => 5 
  case CC_C(_, CC_B(_, _, _), (CC_B(_, _, _),CC_B(_, _, _))) => 6 
}
}