package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], T_A[Byte, Char]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], T_A[Byte, Char]]]
case class CC_C(a: CC_A, b: T_A[T_A[CC_A, CC_B], CC_B]) extends T_A[T_A[CC_A, CC_B], CC_B]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}