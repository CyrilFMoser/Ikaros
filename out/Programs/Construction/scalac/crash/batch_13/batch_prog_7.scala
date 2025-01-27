package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Int]], T_A[T_A[Boolean, Boolean], Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}