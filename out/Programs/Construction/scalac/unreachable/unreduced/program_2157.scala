package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((T_B,T_B),T_A[Byte, Byte]), b: T_B) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[Boolean, D], b: Byte) extends T_A[Boolean, D]
case class CC_C(a: T_A[Boolean, (T_B,T_B)], b: T_A[CC_B[T_B], T_A[Boolean, (Boolean,Char)]], c: CC_B[Int]) extends T_B
case class CC_D(a: Char, b: (Boolean,T_A[Boolean, T_B]), c: CC_A[Int]) extends T_B
case class CC_E(a: T_A[Boolean, T_A[Char, CC_C]], b: (CC_B[CC_D],CC_C), c: Char) extends T_B

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_A(_, _), _, CC_B(_, _))) => 0 
  case CC_A(_, CC_C(CC_B(_, _), _, CC_B(_, _))) => 1 
  case CC_A(_, CC_D(_, (_,_), CC_A(_, _))) => 2 
  case CC_A(_, CC_E(CC_A(_, _), (_,_), _)) => 3 
  case CC_B(_, _) => 4 
}
}
// This is not matched: CC_A(_, CC_E(CC_B(_, _), (_,_), _))