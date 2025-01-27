package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Char], Boolean], C]
case class CC_B(a: CC_A[T_A[Byte, Char]], b: CC_A[CC_A[Byte]], c: T_A[T_A[Int, Boolean], CC_A[Boolean]]) extends T_A[T_A[T_A[Byte, Char], Boolean], CC_A[Boolean]]
case class CC_C[D](a: T_A[D, D]) extends T_A[T_A[T_A[Byte, Char], Boolean], D]

val v_a: T_A[T_A[T_A[Byte, Char], Boolean], CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_) => 2 
}
}