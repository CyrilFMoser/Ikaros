package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Byte, Char]], b: T_A[T_A[Char, Boolean], (Byte,Char)], c: (T_A[(Byte,Char), Char],T_A[Boolean, Int])) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[Int, Boolean]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[Int, Boolean]]
case class CC_C[C](a: CC_B, b: CC_B) extends T_A[C, CC_B]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Int, Char]], T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}