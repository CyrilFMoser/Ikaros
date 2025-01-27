package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Byte],(Boolean,Boolean))) extends T_A[(T_A[(Byte,Boolean)],Boolean)]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[(T_A[(Byte,Boolean)],Boolean)]
case class CC_C[C](a: C, b: T_B[C]) extends T_B[C]
case class CC_D(a: (Int,T_B[CC_B])) extends T_B[T_B[T_A[CC_A]]]
case class CC_E(a: CC_B, b: Int, c: CC_A) extends T_B[T_B[T_A[CC_A]]]

val v_a: T_B[T_B[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_C(_, _)), CC_D(_)) => 0 
  case CC_C(CC_C(_, CC_C(_, _)), CC_E(_, _, CC_A(_))) => 1 
  case CC_D((_,CC_C(_, _))) => 2 
  case CC_E(CC_B(_), _, _) => 3 
}
}
// This is not matched: CC_C(CC_C(_, CC_C(_, _)), CC_C(_, _))