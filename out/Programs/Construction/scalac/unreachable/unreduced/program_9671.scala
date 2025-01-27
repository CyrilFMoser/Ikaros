package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[(Boolean,Byte)], b: T_A[CC_A[Char], CC_A[Int]]) extends T_A[T_A[T_A[T_A[T_A[(Byte,Int), Boolean], T_A[(Byte,Int), Boolean]], T_A[(Byte,Int), Boolean]], T_A[T_A[T_A[(Byte,Int), Boolean], T_A[(Byte,Int), Boolean]], T_A[(Byte,Int), Boolean]]], T_A[T_A[T_A[(Byte,Int), Boolean], T_A[(Byte,Int), Boolean]], T_A[(Byte,Int), Boolean]]]
case class CC_C[D](a: CC_B) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_, _)) => 1 
}
}