package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Byte],T_A[Int, Char])) extends T_A[C, T_A[T_A[Int, Byte], T_A[Boolean, Byte]]]
case class CC_B[D](a: Int) extends T_A[D, T_A[T_A[Int, Byte], T_A[Boolean, Byte]]]
case class CC_C[E](a: (T_A[Byte, Char],T_A[Int, (Char,Int)]), b: (CC_B[Byte],T_A[Int, Int])) extends T_A[E, T_A[T_A[Int, Byte], T_A[Boolean, Byte]]]

val v_a: T_A[Char, T_A[T_A[Int, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C((_,_), (CC_B(_),_))