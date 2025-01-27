package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A], c: T_B[CC_A]) extends T_A
case class CC_C[B](a: B, b: B, c: B) extends T_B[T_B[Byte]]
case class CC_D(a: T_B[CC_C[(Boolean,Byte)]], b: (T_A,Boolean)) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, (CC_A(_, _),true)) => 1 
  case CC_D(_, (CC_A(_, _),false)) => 2 
  case CC_D(_, (CC_B(_, _, _),true)) => 3 
  case CC_D(_, (CC_B(_, _, _),false)) => 4 
}
}