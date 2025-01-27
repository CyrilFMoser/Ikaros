package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[(Int,Byte), T_B], T_B], T_B]
case class CC_B(a: T_B, b: (T_A[Char, CC_A],T_A[T_B, CC_A]), c: Boolean) extends T_A[T_A[T_A[(Int,Byte), T_B], T_B], T_B]
case class CC_C(a: (Byte,T_B), b: ((CC_A,CC_B),Boolean)) extends T_A[T_A[T_A[(Int,Byte), T_B], T_B], T_B]

val v_a: T_A[T_A[T_A[(Int,Byte), T_B], T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(_, ((_,_),_)) => 2 
}
}