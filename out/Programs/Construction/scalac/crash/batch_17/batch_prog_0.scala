package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Byte]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[(Char,CC_A)], b: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[Boolean]], b: (Char,Int)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_A(CC_C(CC_A(_, _), (_,_)), _) => 2 
  case CC_A(CC_C(CC_B(_, _), (_,_)), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_A(CC_C(CC_C(_, _), (_,_)), _)