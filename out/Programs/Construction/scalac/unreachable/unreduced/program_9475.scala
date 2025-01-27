package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_B[T_A[Boolean]], c: T_B[Boolean]) extends T_A[T_B[T_B[Int]]]
case class CC_B[C](a: C) extends T_A[C]
case class CC_C(a: CC_A, b: (CC_A,T_A[CC_A])) extends T_B[T_B[CC_A]]
case class CC_D(a: T_B[Byte], b: CC_A, c: T_B[CC_B[(Boolean,Char)]]) extends T_B[T_B[CC_A]]
case class CC_E() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_B(_), _, _), (CC_A(_, _, _),CC_B(_))) => 0 
  case CC_D(_, CC_A(_, _, _), _) => 1 
  case CC_E() => 2 
}
}