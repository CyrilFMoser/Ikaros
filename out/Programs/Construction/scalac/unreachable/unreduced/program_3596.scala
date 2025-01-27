package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Char]), b: (T_A[Boolean],T_A[Char]), c: T_A[T_A[(Byte,Char)]]) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_B(a: Char, b: CC_A, c: Byte) extends T_A[(T_A[Byte],T_A[Int])]
case class CC_C(a: CC_B) extends T_A[(T_A[Byte],T_A[Int])]

val v_a: T_A[(T_A[Byte],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, CC_A(_, (_,_), _), 0) => 1 
  case CC_B(_, CC_A(_, (_,_), _), _) => 2 
  case CC_C(CC_B(_, _, _)) => 3 
}
}