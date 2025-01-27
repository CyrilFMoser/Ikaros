package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: CC_B[T_A[Int]]) extends T_A[T_B[T_A[Boolean], Byte]]
case class CC_D(a: T_B[T_A[CC_C], T_A[Char]]) extends T_B[T_B[CC_C, CC_C], CC_C]

val v_a: T_A[T_B[T_A[Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)