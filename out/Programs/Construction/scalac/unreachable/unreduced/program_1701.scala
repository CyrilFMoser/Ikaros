package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Byte, Byte]], b: T_A[Byte, T_A[Char, Int]], c: Char) extends T_A[Boolean, T_A[T_A[Boolean, Boolean], T_A[Boolean, Int]]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[Boolean, T_A[T_A[Boolean, Boolean], T_A[Boolean, Int]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Boolean, Boolean], T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}