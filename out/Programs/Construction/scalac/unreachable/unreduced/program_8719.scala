package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[T_B, T_B],T_B), b: T_B) extends T_A[((T_B,T_B),(Int,Int)), T_B]
case class CC_B(a: T_B, b: T_B) extends T_A[((T_B,T_B),(Int,Int)), T_B]
case class CC_C(a: CC_A, b: CC_B, c: Byte) extends T_A[((T_B,T_B),(Int,Int)), T_B]

val v_a: T_A[((T_B,T_B),(Int,Int)), T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A((_,_), _), CC_B(_, _), 0) => 2 
  case CC_C(CC_A((_,_), _), CC_B(_, _), _) => 3 
}
}