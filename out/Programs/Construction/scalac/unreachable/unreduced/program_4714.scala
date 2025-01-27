package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (T_B[Byte, Char],T_B[Byte, Char]), c: D) extends T_A[D]
case class CC_B[E](a: (Boolean,T_A[Char])) extends T_A[E]
case class CC_C(a: T_B[(Boolean,Char), CC_A[Byte]], b: CC_B[T_B[Byte, (Int,Byte)]], c: Int) extends T_B[T_B[Int, (Byte,Boolean)], T_B[(Boolean,(Char,Byte)), T_B[Boolean, Int]]]
case class CC_D(a: CC_C, b: CC_B[CC_B[Boolean]]) extends T_B[T_B[Int, (Byte,Boolean)], T_B[(Boolean,(Char,Byte)), T_B[Boolean, Int]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), _) => 0 
  case CC_A(CC_B((_,_)), (_,_), _) => 1 
  case CC_B(_) => 2 
}
}