package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Byte],Boolean), b: T_B[T_A[Byte]]) extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_B(a: T_A[T_B[CC_A]]) extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_C() extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_D[C](a: C, b: CC_C, c: Int) extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]

val v_a: T_A[T_B[T_B[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _, _),_), CC_D(_, CC_C(), _)) => 0 
  case CC_A((CC_E(_),_), CC_D(_, CC_C(), _)) => 1 
  case CC_A((CC_D(_, _, _),_), CC_E(CC_D(_, _, _))) => 2 
  case CC_A((CC_E(_),_), CC_E(CC_D(_, _, _))) => 3 
  case CC_A((CC_E(_),_), CC_E(CC_E(_))) => 4 
  case CC_B(_) => 5 
  case CC_C() => 6 
}
}
// This is not matched: CC_A((CC_D(_, _, _),_), CC_E(CC_E(_)))