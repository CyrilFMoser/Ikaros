package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Char, (Int,Int)], T_A[Int, Int]]) extends T_A[T_B[(Boolean,Char), (Char,Char)], T_B[T_A[Byte, Byte], Int]]
case class CC_B[E](a: E, b: Byte, c: CC_A) extends T_A[T_B[(Boolean,Char), (Char,Char)], T_B[T_A[Byte, Byte], Int]]
case class CC_C(a: T_A[CC_B[CC_A], Char], b: T_B[Int, CC_B[CC_A]], c: (CC_B[CC_A],(Boolean,(Byte,Boolean)))) extends T_A[T_B[(Boolean,Char), (Char,Char)], T_B[T_A[Byte, Byte], Int]]
case class CC_D(a: CC_A) extends T_B[CC_B[Int], CC_C]
case class CC_E(a: CC_B[(CC_D,(Char,Byte))], b: T_B[(CC_A,Boolean), CC_D], c: T_A[Byte, CC_A]) extends T_B[CC_B[Int], CC_C]

val v_a: T_A[T_B[(Boolean,Char), (Char,Char)], T_B[T_A[Byte, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, (CC_B(_, _, _),(_,_))) => 1 
}
}
// This is not matched: CC_A(_)