package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], Char], b: T_A[Int, Char], c: T_A[T_A[(Char,Byte), Char], Int]) extends T_A[Int, Char]
case class CC_B(a: T_A[CC_A, T_A[CC_A, Boolean]]) extends T_A[Int, Char]
case class CC_C() extends T_A[Int, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}