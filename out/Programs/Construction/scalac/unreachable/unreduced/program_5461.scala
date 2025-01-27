package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Char],T_A[Boolean, Char])) extends T_A[T_A[T_A[(Char,Byte), Boolean], T_A[(Int,Int), Boolean]], C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, CC_A[T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[(Char,Byte), Boolean], T_A[(Int,Int), Boolean]], CC_A[T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}