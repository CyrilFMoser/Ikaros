package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, (Boolean,Boolean)], b: (T_A[Boolean, Boolean],T_A[Int, Int])) extends T_A[T_A[T_A[Char, Int], T_A[(Char,Int), (Boolean,Byte)]], C]
case class CC_B[D](a: Char, b: (T_A[Boolean, Int],CC_A[(Int,Boolean)])) extends T_A[T_A[T_A[Char, Int], T_A[(Char,Int), (Boolean,Byte)]], D]
case class CC_C[E, F]() extends T_A[T_A[T_A[Char, Int], T_A[(Char,Int), (Boolean,Byte)]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[(Char,Int), (Boolean,Byte)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, (_,CC_A(_, _)))