package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (T_A[Boolean],T_A[Byte]), c: (T_A[Byte],T_A[Byte])) extends T_A[Byte]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_A(_, _, _))) => 0 
  case CC_A(_, _, (_,CC_C())) => 1 
  case CC_A(_, _, (_,CC_B(_))) => 2 
  case CC_A(CC_A(CC_C(), (_,_), _), _, _) => 3 
  case CC_A(_, _, (CC_C(),CC_C())) => 4 
  case CC_B(_) => 5 
  case CC_C() => 6 
}
}