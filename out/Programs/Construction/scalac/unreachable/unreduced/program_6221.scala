package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Byte, Int]]]
case class CC_B(a: (T_A[(Char,Char), CC_A],T_A[CC_A, CC_A])) extends T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Byte, Int]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Byte, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Int], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
  case CC_C() => 2 
}
}