package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: (T_A[T_B, Boolean],T_B)) extends T_A[T_A[T_A[(Byte,Byte), T_B], T_B], T_B]
case class CC_B(a: T_B) extends T_A[T_A[T_A[(Byte,Byte), T_B], T_B], T_B]
case class CC_C(a: ((Boolean,Boolean),Int)) extends T_B
case class CC_D(a: (Byte,CC_A), b: CC_B, c: CC_B) extends T_B

val v_a: T_A[T_A[T_A[(Byte,Byte), T_B], T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C(_))) => 0 
  case CC_A(_, (_,CC_D(_, _, _))) => 1 
  case CC_B(CC_C((_,_))) => 2 
}
}
// This is not matched: CC_B(CC_D((_,_), _, CC_B(_)))