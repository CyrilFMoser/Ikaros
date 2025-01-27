package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[T_A[C, Char], C]]
case class CC_B(a: T_A[CC_A[Byte, Int], T_A[(Byte,Boolean), Char]], b: T_A[CC_A[(Boolean,Byte), Boolean], T_A[Byte, Boolean]], c: Byte) extends T_A[Int, T_A[T_A[Int, Char], Int]]

val v_a: T_A[Int, T_A[T_A[Int, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}