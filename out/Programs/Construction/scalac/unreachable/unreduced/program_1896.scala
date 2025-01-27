package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Int], Byte], Char]
case class CC_B(a: T_A[Int, Boolean], b: CC_A, c: Char) extends T_A[T_A[T_A[Char, Int], Byte], Char]
case class CC_C(a: T_A[CC_B, Int], b: CC_B, c: CC_A) extends T_A[T_A[T_A[Char, Int], Byte], Char]

val v_a: T_A[T_A[T_A[Char, Int], Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(), _)