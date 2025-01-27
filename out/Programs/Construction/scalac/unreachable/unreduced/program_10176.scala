package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], Boolean], b: T_A[T_A[Boolean, Boolean], T_A[Boolean, Byte]], c: T_A[T_A[Boolean, Int], T_A[Boolean, Int]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Byte]], (T_A[Boolean, Byte],T_A[Byte, Boolean])]
case class CC_B(a: CC_A, b: CC_A, c: (T_A[CC_A, CC_A],Boolean)) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Byte]], (T_A[Boolean, Byte],T_A[Byte, Boolean])]
case class CC_C(a: T_A[CC_A, CC_A]) extends T_A[CC_A, CC_A]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Byte]], (T_A[Boolean, Byte],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}