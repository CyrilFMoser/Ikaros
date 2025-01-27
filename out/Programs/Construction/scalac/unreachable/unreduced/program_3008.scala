package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Boolean, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: Char, b: T_A[D]) extends T_B[CC_A[Byte]]
case class CC_C(a: T_B[Int], b: (Char,CC_B[Char]), c: CC_A[CC_B[Int]]) extends T_B[CC_A[Byte]]
case class CC_D(a: T_B[CC_A[Byte]]) extends T_B[CC_A[Byte]]

val v_a: T_B[CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_D(CC_C(_, (_,_), CC_A(_, _, _))) => 2 
  case CC_D(CC_D(CC_B(_, _))) => 3 
  case CC_D(CC_D(CC_C(_, _, _))) => 4 
  case CC_D(CC_D(CC_D(_))) => 5 
}
}
// This is not matched: CC_B(_, _)