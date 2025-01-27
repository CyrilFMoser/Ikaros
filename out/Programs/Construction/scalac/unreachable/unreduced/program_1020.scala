package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[CC_A[Int], CC_A[Byte]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Char, Byte]], T_A[CC_A[Int], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}