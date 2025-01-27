package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Int, Boolean]]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: T_A[CC_A[Char], T_A[Byte, Char]]) extends T_A[T_A[T_A[Int, Char], CC_A[Byte]], CC_A[CC_A[Boolean]]]
case class CC_C(a: CC_A[Boolean], b: CC_B) extends T_A[T_A[T_A[Int, Char], CC_A[Byte]], CC_A[CC_A[Boolean]]]

val v_a: T_A[T_A[T_A[Int, Char], CC_A[Byte]], CC_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(CC_A(), _) => 1 
}
}