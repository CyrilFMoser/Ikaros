package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: D) extends T_A[C, T_A[(Char,Boolean), T_A[(Byte,Int), (Byte,Byte)]]]
case class CC_B[E](a: E) extends T_A[E, T_A[(Char,Boolean), T_A[(Byte,Int), (Byte,Byte)]]]
case class CC_C[F](a: (T_A[Int, Boolean],T_A[Char, Byte])) extends T_A[F, T_A[(Char,Boolean), T_A[(Byte,Int), (Byte,Byte)]]]

val v_a: T_A[Boolean, T_A[(Char,Boolean), T_A[(Byte,Int), (Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C((_,_)) => 2 
}
}