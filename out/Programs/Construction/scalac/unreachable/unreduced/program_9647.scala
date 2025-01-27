package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Boolean, Int]], C]
case class CC_B[D](a: D, b: CC_A[D], c: (CC_A[Int],T_A[Char, Int])) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Boolean, Int]], D]
case class CC_C[E](a: Int, b: E) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Boolean, Int]], E]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (CC_A(),_)) => 1 
  case CC_C(_, _) => 2 
}
}