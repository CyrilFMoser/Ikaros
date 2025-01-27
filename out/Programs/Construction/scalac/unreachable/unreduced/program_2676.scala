package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[(Byte,Int), Boolean], T_A[Byte, (Boolean,Int)]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_A[T_A[(Byte,Int), Boolean], T_A[Byte, (Boolean,Int)]]]
case class CC_C[E](a: CC_A[E], b: CC_B[E]) extends T_A[E, T_A[T_A[(Byte,Int), Boolean], T_A[Byte, (Boolean,Int)]]]

val v_a: T_A[Char, T_A[T_A[(Byte,Int), Boolean], T_A[Byte, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}