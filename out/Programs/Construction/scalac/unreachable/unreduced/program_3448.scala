package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_B[C]], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C(a: T_B[Byte], b: T_A[T_A[Boolean]]) extends T_B[(CC_B[Boolean],CC_A[Int])]
case class CC_D(a: T_A[T_A[CC_C]], b: CC_C) extends T_B[(CC_B[Boolean],CC_A[Int])]

val v_a: T_B[(CC_B[Boolean],CC_A[Int])] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _, CC_A(_, _, _)), _) => 1 
  case CC_D(CC_A(_, _, CC_B(_, _, _)), _) => 2 
  case CC_D(CC_B(CC_A(_, _, _), CC_A(_, _, _), _), _) => 3 
  case CC_D(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), _) => 4 
  case CC_D(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 5 
}
}
// This is not matched: CC_D(CC_B(CC_A(_, _, _), CC_B(_, _, _), _), _)