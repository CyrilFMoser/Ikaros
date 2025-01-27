package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: ((Int,Int),T_B[Boolean]), b: Char) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[(Int,Char), Boolean]], D]
case class CC_B[E](a: (T_B[(Byte,Int)],T_A[Boolean, (Char,Byte)]), b: E) extends T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[(Int,Char), Boolean]], E]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Boolean], T_A[(Int,Char), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), 'x') => 0 
  case CC_A(((_,_),_), _) => 1 
  case CC_B((_,_), _) => 2 
}
}