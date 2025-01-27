package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], Char]) extends T_A[T_A[T_A[(Char,Char), (Char,Byte)], T_A[Int, Byte]], (T_A[Int, (Int,Byte)],T_A[Byte, Char])]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_A[(Char,Char), (Char,Byte)], T_A[Int, Byte]], (T_A[Int, (Int,Byte)],T_A[Byte, Char])]
case class CC_C[C](a: CC_A) extends T_A[T_A[T_A[(Char,Char), (Char,Byte)], T_A[Int, Byte]], (T_A[Int, (Int,Byte)],T_A[Byte, Char])]

val v_a: T_A[T_A[T_A[(Char,Char), (Char,Byte)], T_A[Int, Byte]], (T_A[Int, (Int,Byte)],T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_)) => 2 
}
}