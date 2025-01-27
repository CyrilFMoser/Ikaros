package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Boolean], T_A[Char]]]
case class CC_B[D]() extends T_B[(Int,Byte), D]
case class CC_C(a: (T_B[CC_A, CC_A],T_A[Int]), b: T_B[CC_B[CC_A], CC_B[CC_A]]) extends T_B[(Int,Byte), Char]
case class CC_D[E](a: Char, b: T_B[(Int,Byte), E]) extends T_B[(Int,Byte), E]

val v_a: T_B[(Int,Byte), Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_B()) => 2 
  case CC_D(_, CC_C((_,_), _)) => 3 
  case CC_D(_, CC_D(_, CC_C(_, _))) => 4 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 5 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_B()))