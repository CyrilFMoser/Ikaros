package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Int],T_A[Byte])) extends T_A[T_B[T_A[Char], T_B[Byte, Char]]]
case class CC_B() extends T_B[T_B[T_B[CC_A, CC_A], T_A[Byte]], T_B[CC_A, T_B[CC_A, (Boolean,Byte)]]]
case class CC_C[D](a: T_A[D], b: T_B[(CC_B,Boolean), T_B[D, D]], c: CC_B) extends T_B[T_B[T_B[CC_A, CC_A], T_A[Byte]], T_B[CC_A, T_B[CC_A, (Boolean,Byte)]]]
case class CC_D(a: CC_A) extends T_B[T_B[T_B[CC_A, CC_A], T_A[Byte]], T_B[CC_A, T_B[CC_A, (Boolean,Byte)]]]

val v_a: T_B[T_B[T_B[CC_A, CC_A], T_A[Byte]], T_B[CC_A, T_B[CC_A, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D(CC_A(_))