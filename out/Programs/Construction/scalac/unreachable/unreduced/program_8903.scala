package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Int]]]
case class CC_B[C, D](a: T_A[C], b: (T_B[CC_A],Boolean)) extends T_B[C]
case class CC_C[E](a: T_B[E], b: T_A[E]) extends T_B[T_B[T_B[(Boolean,Char)]]]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[T_B[T_B[T_B[(Boolean,Char)]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_B(_, _),_)) => 0 
  case CC_B(_, (CC_D(),_)) => 1 
  case CC_D() => 2 
}
}