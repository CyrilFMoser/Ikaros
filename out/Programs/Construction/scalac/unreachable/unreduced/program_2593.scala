package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Int],Char), b: ((Int,Int),Byte), c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Int, Byte], T_A[(Byte,Byte), (Boolean,Boolean)]]]
case class CC_B[D](a: Byte, b: D, c: T_A[CC_A[D], D]) extends T_A[T_A[CC_A[Boolean], Int], T_A[T_A[Int, Byte], T_A[(Byte,Byte), (Boolean,Boolean)]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Int, Byte], T_A[(Byte,Byte), (Boolean,Boolean)]]]

val v_a: T_A[Int, T_A[T_A[Int, Byte], T_A[(Byte,Byte), (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), ((_,_),_), _) => 0 
  case CC_C() => 1 
}
}