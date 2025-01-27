package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean, b: T_B[Char]) extends T_A[T_B[T_B[Int]], T_B[Boolean]]
case class CC_B(a: (CC_A,((Boolean,Boolean),CC_A)), b: T_A[(CC_A,Byte), T_A[CC_A, CC_A]]) extends T_A[T_B[T_B[Int]], T_B[Boolean]]
case class CC_C[D]() extends T_B[D]
case class CC_D(a: CC_C[CC_A], b: CC_C[Int], c: CC_B) extends T_B[Char]
case class CC_E() extends T_B[Char]

val v_a: T_A[T_B[T_B[Int]], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_A(_, CC_D(CC_C(), _, CC_B(_, _))) => 1 
  case CC_A(_, CC_E()) => 2 
  case CC_B((CC_A(_, _),(_,_)), _) => 3 
}
}