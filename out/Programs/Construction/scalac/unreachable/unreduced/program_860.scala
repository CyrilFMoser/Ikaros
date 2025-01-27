package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Char], T_A[Char, Byte]], b: T_A[T_A[Boolean, Int], Int], c: Boolean) extends T_A[T_A[T_A[Boolean, Int], T_B[Char]], T_B[T_B[Boolean]]]
case class CC_B(a: Boolean, b: T_B[T_A[Boolean, CC_A]], c: Boolean) extends T_A[T_A[T_A[Boolean, Int], T_B[Char]], T_B[T_B[Boolean]]]
case class CC_C(a: CC_A, b: T_B[T_B[Boolean]], c: CC_A) extends T_A[T_A[T_A[Boolean, Int], T_B[Char]], T_B[T_B[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_B[Char]], T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
  case CC_C(CC_A(_, _, _), _, _) => 3 
}
}