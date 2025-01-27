package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, T_A[Int, Int]], b: T_A[T_A[Boolean, Char], Char], c: T_A[T_A[Byte, Byte], Int]) extends T_A[T_A[T_A[Char, Char], Char], Int]
case class CC_B(a: (CC_A,T_A[CC_A, (Int,Char)]), b: T_A[T_A[CC_A, CC_A], T_A[CC_A, Boolean]], c: Boolean) extends T_A[T_A[CC_A, Boolean], Byte]
case class CC_C() extends T_A[T_A[T_A[Char, Char], Char], Int]

val v_a: T_A[T_A[T_A[Char, Char], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}