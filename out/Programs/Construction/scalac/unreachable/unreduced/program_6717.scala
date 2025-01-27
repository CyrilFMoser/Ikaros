package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_A[T_B],T_A[T_B])) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_B, b: ((CC_A,T_B),Byte), c: T_A[(CC_B,CC_A)]) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A(_, (CC_A(_, _),CC_B())) => 1 
  case CC_A(_, (CC_A(_, _),CC_C(_, _, _))) => 2 
  case CC_A(_, (CC_B(),CC_A(_, _))) => 3 
  case CC_A(_, (CC_B(),CC_B())) => 4 
  case CC_A(_, (CC_B(),CC_C(_, _, _))) => 5 
  case CC_A(_, (CC_C(_, _, _),CC_A(_, _))) => 6 
  case CC_A(_, (CC_C(_, _, _),CC_B())) => 7 
  case CC_A(_, (CC_C(_, _, _),CC_C(_, _, _))) => 8 
  case CC_B() => 9 
  case CC_C(_, ((_,_),0), _) => 10 
  case CC_C(_, ((_,_),_), _) => 11 
}
}