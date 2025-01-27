package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[(Boolean,Byte)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[Char]
case class CC_C(a: T_A[T_A[Char]], b: CC_B, c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B(), CC_B()) => 1 
}
}