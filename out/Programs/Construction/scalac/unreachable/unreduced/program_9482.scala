package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Boolean,Byte), b: T_B[Char]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C](a: Boolean, b: C, c: (T_B[CC_B],T_A[CC_A])) extends T_B[C]
case class CC_D(a: T_B[Byte], b: T_B[T_A[CC_B]]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, (CC_C(_, _, _),_)) => 0 
  case CC_D(CC_C(_, _, (_,_)), _) => 1 
  case CC_D(CC_D(CC_D(_, _), _), _) => 2 
}
}
// This is not matched: CC_D(CC_D(CC_C(_, _, _), _), _)