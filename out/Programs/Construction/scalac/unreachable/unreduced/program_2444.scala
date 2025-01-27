package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Int]], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: Byte, b: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A(_, _, CC_B(_, _))) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
}
}