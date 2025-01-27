package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_B[T_B[Boolean]], b: T_A[T_A[(Byte,Byte)]]) extends T_B[Boolean]
case class CC_D(a: (T_B[Boolean],T_A[CC_C]), b: (T_A[Int],T_B[CC_C]), c: Byte) extends T_B[Boolean]
case class CC_E(a: CC_A[T_B[Boolean]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D((_,_), (_,_), 0) => 0 
  case CC_D((_,_), (_,_), _) => 1 
  case CC_E(_) => 2 
}
}
// This is not matched: CC_C(_, _)