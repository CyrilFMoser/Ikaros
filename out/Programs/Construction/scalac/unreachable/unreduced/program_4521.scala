package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_B[T_A[Char]]) extends T_A[Char]
case class CC_B(a: T_A[Byte], b: T_B[T_A[Char]], c: T_A[Char]) extends T_A[Char]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_A[D], b: (Byte,T_B[Int]), c: CC_B) extends T_B[D]
case class CC_E(a: T_B[CC_C[(Char,Char)]], b: (CC_D[CC_B],Byte), c: Boolean) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, (_,CC_D(_, _, _)), CC_B(_, CC_C(), _)) => 1 
  case CC_D(_, (_,CC_C()), CC_B(_, CC_D(_, _, _), _)) => 2 
  case CC_D(_, (_,CC_D(_, _, _)), CC_B(_, CC_D(_, _, _), _)) => 3 
  case CC_E(_, (CC_D(_, _, _),_), _) => 4 
}
}
// This is not matched: CC_D(_, (_,CC_C()), CC_B(_, CC_C(), _))